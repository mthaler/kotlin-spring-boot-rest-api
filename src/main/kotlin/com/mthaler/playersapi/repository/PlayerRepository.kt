package com.mthaler.playersapi.repository

import com.mthaler.playersapi.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author  Manuel Ernesto (manuelernest0)
 * @date  05/07/22 8:45 PM
 * @version 1.0
 */

@Repository
interface PlayerRepository : JpaRepository<Player, Long>