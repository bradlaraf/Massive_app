package com.example.sap.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sap.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{

    ArrayList<HashMap<String, String>> arrayList;

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        HashMap<String, String> map = arrayList.get(position);
        holder.txvNombreMenu.setText(map.get("nombre"));
        String imageName = map.get("imagen");
        int imageResId = holder.itemView.getContext().getResources().getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());
        holder.imvIconoMenu.setImageResource(imageResId);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imvIconoMenu;
        TextView txvNombreMenu;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imvIconoMenu = itemView.findViewById(R.id.imvIconoMenu);
            txvNombreMenu = itemView.findViewById(R.id.txvNombreMenu);

        }
    }
}
