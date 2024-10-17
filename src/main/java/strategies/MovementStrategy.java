package com.kosmickong.strategies;

import com.kosmickong.entities.Entity;

/**
 * Interface defining the movement behavior of entities.
 */
public interface MovementStrategy {

    /**
     * Moves the entity based on its specific movement logic.
     *
     * @param entity The entity to move.
     */
    void move(Entity entity);
}
