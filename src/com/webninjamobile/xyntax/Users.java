package com.webninjamobile.xyntax;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Users extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
        User userdata[] = new User[]
		        {
		            new User("Mom"),
		            new User("Dad"),
		            new User("Kuya Tonette"),
		            new User("Ate Neo"),
		            new User("Tito Jun"),
		            new User("Yaya Kapin"),
		            new User("Mom"),
		            new User("Dad"),
		            new User("Kuya Tonette"),
		            new User("Ate Neo"),
		            new User("Tito Jun"),
		            new User("Yaya Kapin"),

		        };
        
//        UserAdapter adapter = new UserAdapter(this,
//                R.layout.userlist, userdata);
       
       
        ListView listView1 = (ListView)findViewById(R.id.list);
        
//        listView1.setAdapter(adapter);
       
    }
}