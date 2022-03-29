package com.example.constraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //Deklarasi variabel dengan jenis data Layout inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;

    public ListViewAdapter(Context context) {
        //Memberi nilai mContext dengan context
        mContext = context;

        //Mengatur Layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //Memberikan nilai arraylist dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //Menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }

    //Membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam listviwe
    public class ViewHolder {
        //Mendeklarasikan variabel dengan jenis TextView
        TextView name;
    }

    //Fungsi getCount () mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount() {
        //Mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return Home_Activity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null) {
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        return view;
    }
}
