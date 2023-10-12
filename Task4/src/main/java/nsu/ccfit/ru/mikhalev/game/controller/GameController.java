package nsu.ccfit.ru.mikhalev.game.controller;

import nsu.ccfit.ru.mikhalev.game.gui.GUIGameSpace;
import nsu.ccfit.ru.mikhalev.network.NetworkController;
import nsu.ccfit.ru.mikhalev.network.model.keynode.HostNetworkKey;
import nsu.ccfit.ru.mikhalev.network.model.message.NodeRole;
import nsu.ccfit.ru.mikhalev.observer.*;
import nsu.ccfit.ru.mikhalev.protobuf.snakes.SnakesProto;


public interface GameController extends ObserverState, ObserverError {
    void startGame();

    void createConfigGame(String nameGame, String namePlayer, SnakesProto.GameConfig gameConfig);

    void subscriptionOnPlayerManager(ObserverNetwork observerNetwork);

    void subscriptionOnMulticastService(ObserverNetwork observerNetwork);

    void registrationNetworkController(NetworkController networkController);

    void updateStateGUI(SnakesProto.GameMessage gameMessage);

    void registrationGUIGameSpace(GUIGameSpace guiGameSpace);

    void moveSnakeByHostKey(HostNetworkKey key, SnakesProto.Direction direction);

    void joinToGame(HostNetworkKey hostNetworkKey, SnakesProto.GameMessage.JoinMsg message, SnakesProto.NodeRole role);

    void moveHandler(SnakesProto.Direction direction);

    void initJoinGame(String playerName, String nameGame, SnakesProto.NodeRole role);

    void sendMessageNetwork(String nameGame, SnakesProto.GameMessage gameMessage);

    void reportErrorGUI(String message);
}
