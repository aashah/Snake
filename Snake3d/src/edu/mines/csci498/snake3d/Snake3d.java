/* Snake3d
 * Author: Aakash Shah
 * Description: 3d Snake game on a cubic surface.
 * 
 * Credits:
 * -Icon taken from Game-Icons (http://game-icons.net/lorc/originals/snake.html)
 * 
 */

package edu.mines.csci498.snake3d;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Snake3d extends Activity {

	GLSurfaceView snakeSurfaceView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        snakeSurfaceView = new GLSurfaceView(this);
        snakeSurfaceView.setRenderer(new SnakeRenderer());
        
        setContentView(snakeSurfaceView);
        //setContentView(R.layout.main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	if (item.getItemId() == R.id.about) {
    		//TODO: Show about dialog
    		return true;
    	}
    	return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
