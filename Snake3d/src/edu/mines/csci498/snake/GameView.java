package edu.mines.csci498.snake;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {
	

	/* Hold the state of the game
	 * MENU - Menu screen (show options)
	 * GAME - Game screen (show game)
	 * LOSE - Lost game (show lost game screen)
	 */
	private int mState = MENU;
	public static final int MENU = 0;
	public static final int GAME = 1;
	public static final int LOSE = 2;
	
	//Score & move delay
	private int mNumberOfApples = 0;
	private int mSpeed = 1000;
	
	 /* 
	  * Hold the direction, next direction (for collision detection)
	  */
	private int mDirection = NORTH;
	private int mNextDirection = NORTH; //Initialized to be same as mDirection
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	private RefreshHandler mRefreshHandler = new RefreshHandler(this);
	
	/*
	 * This inner class is used to mimic animation by passing delayed empty messages to mimic a redraw cycle.
	 * I found this on the official android documentation in one of their demos
	 */
    class RefreshHandler extends Handler {
    	private GameView game;
    	
    	public RefreshHandler(GameView handle) {
    		this.game = handle;
    	}
    	
        @Override
        public void handleMessage(Message msg) {
            game.update();
            game.invalidate();
        }

        public void sleep(long delayMillis) {
        	this.removeMessages(0);
            sendMessageDelayed(obtainMessage(0), delayMillis);
        }
    };
    
	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public GameView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	public void setMode(int mode) {
		this.mState = mode;
	}
	
	public void update() {
		
	}

}
