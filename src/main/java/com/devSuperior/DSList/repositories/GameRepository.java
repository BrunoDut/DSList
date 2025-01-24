package com.devSuperior.DSList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devSuperior.DSList.entities.Game;
import com.devSuperior.DSList.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
    // o proprio frame works fez a configuração necessaria <objeto, tipo da Id>
	@Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS "year", tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
List<GameMinProjection> searchByList(Long listId);
  // o parametro tem que ser exato onde esta o WHERE
}
