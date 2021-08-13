package su.appoint.jm_education_project.views.main;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        Checkbox checkbox = new Checkbox();
        checkbox.setLabel("Option");
        checkbox.setValue(true);
        add(checkbox);
    }

}