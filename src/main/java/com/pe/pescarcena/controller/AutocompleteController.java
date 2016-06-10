package com.pe.pescarcena.controller;

import com.pe.pescarcena.entity.Client;
import com.pe.pescarcena.model.ClientModel;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by root on 6/6/16.
 */
@ManagedBean
public class AutocompleteController {
    private Client selectedClient;

    public List<Client> complete(String query) {
        return ClientModel.getClientsByName(query);
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }

    public String submit()
    {
        System.out.println("Selected client: " + this.selectedClient.getName());
        return "result";
    }
}
