package nsu.ccfit.ru.mikhalev.game.model;

import nsu.ccfit.ru.mikhalev.protobuf.snakes.SnakesProto;

public record PlayerState(Integer playerID, String playerName, SnakesProto.NodeRole role) {}