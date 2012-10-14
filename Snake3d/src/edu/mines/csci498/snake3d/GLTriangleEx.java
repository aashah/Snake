package edu.mines.csci498.snake3d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public class GLTriangleEx {
	
	private float vertices[] = {
		0f, 1f, //p0
		1f, -1f //p1
		-1f, -1f
	};
	
	private FloatBuffer vertBuff;
	
	private short[] pIndex = { 0, 1, 2 };
	
	private ShortBuffer pointBuff;
	
	public GLTriangleEx() {
		ByteBuffer bBuff = ByteBuffer.allocateDirect(vertices.length * 4);
		bBuff.order(ByteOrder.nativeOrder());
		vertBuff = bBuff.asFloatBuffer();
		vertBuff.put(vertices);
		vertBuff.position(0);
		
		ByteBuffer pBuff = ByteBuffer.allocateDirect(pIndex.length * 2);
		pBuff.order(ByteOrder.nativeOrder());
		pointBuff = pBuff.asShortBuffer();
		pointBuff.put(pIndex);
		pointBuff.position(0);
	}
}
