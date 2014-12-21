package com.webninjamobile.xyntax;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Resources ressources = getResources();
		TabHost tabHost = getTabHost();
		tabHost.getTabWidget().setStripEnabled(false);
		// Users tab
		Intent users = new Intent().setClass(this, Users.class);
		TabSpec userstab = tabHost.newTabSpec("Android").setIndicator("", ressources.getDrawable(R.drawable.users)).setContent(users);

		// Presets tab
		Intent presets = new Intent().setClass(this, Presets.class);
		TabSpec presetstab = tabHost.newTabSpec("Apple").setIndicator("", ressources.getDrawable(R.drawable.presets)).setContent(presets);

		// Dashboard tab
		Intent dashboard = new Intent().setClass(this, Dashboard.class);
		TabSpec dashboardtab = tabHost.newTabSpec("Windows").setIndicator("", ressources.getDrawable(R.drawable.dashboard)).setContent(dashboard);

		// Settings tab
		Intent settings = new Intent().setClass(this, Settings.class);
		TabSpec settingstab = tabHost.newTabSpec("Berry").setIndicator("", ressources.getDrawable(R.drawable.settings)).setContent(settings);

		// Help tab
		Intent help = new Intent().setClass(this, Help.class);
		TabSpec helptab = tabHost.newTabSpec("Berry").setIndicator("", ressources.getDrawable(R.drawable.help)).setContent(help);

		// add all tabs
		tabHost.addTab(userstab);
		tabHost.addTab(presetstab);
		tabHost.addTab(dashboardtab);
		tabHost.addTab(settingstab);
		tabHost.addTab(helptab);

		// set Dashboard tab as default (zero based)
		tabHost.setCurrentTab(2);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
