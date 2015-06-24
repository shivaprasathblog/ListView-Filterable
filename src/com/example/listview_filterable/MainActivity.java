package com.example.listview_filterable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	
ListView lv;

String [] fruits ={"Laptop","Tablet","Mobile","Desktop","Keyboard","Mouse","Hard Disk","RAM"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv=(ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<String>ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,fruits);
		lv.setAdapter(ad);
		lv.setTextFilterEnabled(true);
		lv.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) 
					
			{
				// TODO Auto-generated method stub
				
			
			}
		});
	}



}