package com.example.pdvsv2.data;

import android.app.Application;

import com.example.pdvsv2.items.DocList;

import java.util.ArrayList;
import java.util.List;

public class DataManager extends Application {
    private static DataManager dataManager;
    private List<DocList> docList = new ArrayList<>();
}
