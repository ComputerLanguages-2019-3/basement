public class BasementToBashCode extends basementBaseListener {
    String translate = "";

    @Override
    public void enterCommand(basementParser.CommandContext ctx) {
        super.enterCommand(ctx);
        if (ctx.REMOVE_TK() != null) {
            this.translate += "docker rm";
        }
    }

    @Override
    public void exitCommand(basementParser.CommandContext ctx) {
        super.exitCommand(ctx);
        if (ctx.ID() != null){
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
            this.translate += " down";
        }
    }
}
