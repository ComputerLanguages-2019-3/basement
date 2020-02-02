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
    public void exitDeploy_values(basementParser.Deploy_valuesContext ctx) {
        super.exitDeploy_values(ctx);
         if(ctx.FALSE_TK() != null) {
            this.detachedConfig = false;
         }
    }

    @Override
    public void enterConfig(basementParser.ConfigContext ctx) {
        super.enterConfig(ctx);
        boolean containerNamePresent = ctx.ID().getText() != null;
        if (ctx.DEPLOY_TK() != null && containerNamePresent) {
            this.translate += "docker run --name " + ctx.ID().getText() ;
        }
    }

    @Override
    public void exitConfig(basementParser.ConfigContext ctx) {
        super.exitConfig(ctx);
        if (ctx.image_type().getText() != null) {
            this.translate += " " +ctx.image_type().getText();
        }
        if (ctx.DEPLOY_TK() != null && this.detachedConfig) {
            this.translate += " -d";
        }
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
            this.translate += performVal + " \"";
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
