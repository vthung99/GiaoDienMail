package com.example.assignmentt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<ContactModel> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);

        list.add(new ContactModel("Abstract","Khai báo lớp, phương thức, interface trừu tượng không có thể hiện(instance) cụ thể","15 th4",false));
        list.add(new ContactModel("Boolean","Khai báo biến kiểu logic với 2 trị: true, false","15 th4",false));
        list.add(new ContactModel("Catch","Được sử dụng để bắt ngoại lệ, được sử dụng cùng với try để xử lý các ngoại lệ xảy ra trong chương trình","15 th4",false));
        list.add(new ContactModel("Default","Mặc định đươc thực thi khi không có case nào trả về giá trị true (dùng trong switch case)","15 th4",false));
        list.add(new ContactModel("Extends","Được sử dụng để định nghĩa lớp con kế thừa các thuộc tính và phương thức từ lớp cha","14 th4",false));
        list.add(new ContactModel("Finally","Thực hiện một khối lệnh đến cùng bất chấp các ngoại lệ có thể xảy ra. Được sử dụng trong try-catch","14 th4",false));
        list.add(new ContactModel("Instanceof","Kiểm tra xem một đối tượng nào đó có phải là một thể hiện của 1 class được định nghĩa trước hay không","13 th4",false));
        list.add(new ContactModel("Return","Kết thúc phương thức và trả về giá trị cho phương thức","12 th4",false));
        list.add(new ContactModel("Switch","Sử dụng trong câu lệnh điều khiển switch case","11 th4",false));
        list.add(new ContactModel("Throws","Chỉ định cho qua ngoại lệ khi exception xảy ra","10 th4",false));
        list.add(new ContactModel("Void","Chỉ định một phương thức không trả về giá trị","10 th4",false));
        list.add(new ContactModel("While","Được sử dụng trong lệnh điều khiển while","10 th4",false));

        ContactAapter adapter=new ContactAapter(list);
        listView.setAdapter(adapter);
    }
}
