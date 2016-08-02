package chou.aric.qqslidemenu;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import chou.aric.qqslidemenu.view.SlidingMenu;

public class MainActivity extends Activity
{

	private SlidingMenu mLeftMenu ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
	}
	
	public void toggleMenu(View view)
	{
		mLeftMenu.toggle();
	}



}
