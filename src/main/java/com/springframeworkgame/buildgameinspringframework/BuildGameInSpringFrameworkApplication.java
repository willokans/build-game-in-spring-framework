package com.springframeworkgame.buildgameinspringframework;

import com.springframeworkgame.buildgameinspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BuildGameInSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(BuildGameInSpringFrameworkApplication.class, args);

		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);

		runner.runGame();


	}

}
