package cn.master.pattern.proxy.sample_1;


public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        gamePlayer.login(username, password);
    }

    @Override
    public void battle() {
        gamePlayer.battle();

    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
