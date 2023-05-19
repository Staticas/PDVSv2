package com.example.pdvsv2.items;

import java.util.List;

public class DocList {
    private String docItemTitle;
    private List<DocItem> docItemList;
    private boolean isExpanded = false;

    public String getDocItemTitle() {
        return docItemTitle;
    }

    public DocList(String docItemTitle, List<DocItem> docItemList){
        this.docItemTitle = docItemTitle;
        this.docItemList = docItemList;
    }

    public List<DocItem> getDocItemList() {
        return docItemList;
    }

    public void setDocItemTitle(String docItemTitle) {
        this.docItemTitle = docItemTitle;
    }

    public void setDocItemList(List<DocItem> docItemList) {
        this.docItemList = docItemList;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
