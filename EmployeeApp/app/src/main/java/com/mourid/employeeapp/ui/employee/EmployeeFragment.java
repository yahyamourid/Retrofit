package com.mourid.employeeapp.ui.employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mourid.employeeapp.databinding.FragmentEmployeeBinding;


public class EmployeeFragment extends Fragment {
    private FragmentEmployeeBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EmployeeViewModel employeeModel = new ViewModelProvider(this).get(EmployeeViewModel.class);
        binding = FragmentEmployeeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView nom = binding.text;
        nom.setText(employeeModel.getData());

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}