package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuItemsResponse {
    private List<MenuItems> menuItems;

    public List<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MenuItemsResponse [");
        if (menuItems != null && !menuItems.isEmpty()) {
            sb.append("menuItems=").append(menuItems);
        }
        sb.append("]");
        return sb.toString();
    }
}
