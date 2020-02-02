public class BasementToBashCode extends basementBaseListener {
    String translate = "";

    @Override
    public void enterCommand(basementParser.CommandContext ctx) {
        super.enterCommand(ctx);
        if (ctx.REMOVE_TK() != null) {
            this.translate += "docker rm";
        }

        if (ctx.PERFORM_TK() != null) {
            this.translate += "docker exec -it " + ctx.ID() + " bash -c \"";
        }
    }

    @Override
    public void enterPerform_keys(basementParser.Perform_keysContext ctx) {
        super.enterPerform_keys(ctx);
        if (ctx.DIR_TK() != null) {
            this.translate += " cd " + ctx.DIR_TK().getText();
        }
    }



    @Override
    public void exitCommand(basementParser.CommandContext ctx) {
        super.exitCommand(ctx);
        if (ctx.ID() != null && ctx.PERFORM_TK() == null){
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
