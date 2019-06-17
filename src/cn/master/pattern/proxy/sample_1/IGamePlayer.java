package cn.master.pattern.proxy.sample_1;

public interface IGamePlayer {

    /**
     * 登录
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 游戏战斗
     */
    void battle();

    /**
     * 升级
     */
    void upgrade();

}
