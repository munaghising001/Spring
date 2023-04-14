package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.superContraGame;

public class App01GamingBasic {

	public static void main(String[] args){
	
    //  var game = new MarioGame();
//	var game = new superContraGame();
	    var game = new PacmanGame(); //1:Object Creation
	    
		var gameRunner = new GameRunner(game);//2:Object Creation + wiring of Dependencies
      // game is a Dependency of the GameRunner class
     gameRunner.run();
	}

}
