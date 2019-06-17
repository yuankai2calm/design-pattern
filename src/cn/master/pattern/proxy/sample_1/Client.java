package cn.master.pattern.proxy.sample_1;

import cn.master.pattern.proxy.sample_1.impl.GamePlayer;

/**
 * 代理模式
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("大师");
        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);

        proxy.login("master", "123456");

        proxy.battle();

        proxy.upgrade();
    }
}
