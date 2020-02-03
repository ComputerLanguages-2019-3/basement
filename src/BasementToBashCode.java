public class BasementToBashCode extends basementBaseListener {
    String translate = "";
    boolean detachedConfig = true;

    @Override
    public void enterCommand(basementParser.CommandContext ctx) {
        super.enterCommand(ctx);
        if (ctx.REMOVE_TK() != null) {
            this.translate += "docker rm";
        }

        if (ctx.PERFORM_TK() != null) {
            this.translate += "docker exec -i " + ctx.ID().getText() + " bash -c \"";
        }
    }

    @Override
    public void enterDeploy_regular_params(basementParser.Deploy_regular_paramsContext ctx) {
        super.enterDeploy_regular_params(ctx);

        if (ctx.deploy_keys().PORT_TK() != null) {
            String portVal = ctx.deploy_values().STRING().getText().replaceAll("\"", "");
            this.translate += " -p " + portVal;
        }
    }

    @Override
    public void exitDeploy_values(basementParser.Deploy_valuesContext ctx) {
        super.exitDeploy_values(ctx);
         if(ctx.FALSE_TK() != null) {
            this.detachedConfig = false;
         }
    }

    @Override
    public void enterEnv_params(basementParser.Env_paramsContext ctx) {
        super.enterEnv_params(ctx);
        String envVal = ctx.env_values().STRING().getText();

        if (ctx.env_keys().POSTGRES_ENV_TK() != null) {
            this.translate += " -e " + ctx.env_keys().POSTGRES_ENV_TK().getText();
        }

        if (ctx.env_keys().MONGO_ENV_TK() != null) {
            this.translate += " -e " + ctx.env_keys().MONGO_ENV_TK().getText();
        }
        this.translate += "=" + envVal;
    }

    @Override
    public void enterConfig(basementParser.ConfigContext ctx) {
        super.enterConfig(ctx);
        if (ctx.DEPLOY_TK() != null && ctx.ID() != null) {
            this.translate += "docker run --name " + ctx.ID().getText() ;
        }

        if (ctx.BASEMNT_LIST() != null) {
            this.translate += "docker ps ";
        }
    }

    @Override
    public void enterBst_params(basementParser.Bst_paramsContext ctx) {
        super.enterBst_params(ctx);
        if(ctx.bst_values().STRING() != null) {
            String bstVal = ctx.bst_values().STRING().getText().replaceAll("\"", "");
            if(ctx.bst_keys().FLAG_TOKEN() != null) {
                this.translate += " -a";
            } else {
                this.translate += " | grep " + bstVal;
            }
        }
    }

    @Override
    public void exitConfig(basementParser.ConfigContext ctx) {
        super.exitConfig(ctx);
        if (ctx.DEPLOY_TK() != null && this.detachedConfig) {
            this.translate += " -d";
        }
        if (ctx.image_type() != null) {
            this.translate += " " +ctx.image_type().getText();
        }
        this.translate += "\n";
        this.detachedConfig = true;
    }

    @Override
    public void enterPerform_params(basementParser.Perform_paramsContext ctx) {
        super.exitPerform_params(ctx);
        String performVal = ctx.perform_values().STRING().getText().replaceAll("\"", "");
        boolean keyVal = ctx.perform_values().STRING().getText() != "";
        if (ctx.perform_keys().DIR_TK() != null && keyVal) {
            System.out.println(ctx.perform_values().STRING().getText());
            this.translate += " cd " + performVal + " &&";
        } else if (ctx.perform_keys().COMMAND_TK() != null && keyVal) {
            this.translate += "sleep 10 && " + performVal + " \""; // TODO: delete sleep process
        }
    }

    @Override
    public void exitCommand(basementParser.CommandContext ctx) {
        super.exitCommand(ctx);
        if (ctx.ID().getText() != null && ctx.PERFORM_TK() == null){
            this.translate += " " + ctx.ID().getText();
        }
        this.translate += '\n';
    }

    @Override
    public void exitType_command(basementParser.Type_commandContext ctx) {
        this.translate += "docker";
        super.exitType_command(ctx);
        if (ctx.UP_TK() != null ) {
            this.translate += " start";
        }

        if (ctx.DOWN_TK() != null ) {
            this.translate += " stop";
        }
    }
}
