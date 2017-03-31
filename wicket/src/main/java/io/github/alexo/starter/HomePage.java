package io.github.alexo.starter;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

@WicketHomePage
public class HomePage extends WebPage {
    public HomePage() {
        Form form = new Form<String>("form") {
            @Override
            protected void onSubmit() {
                HomePage.this.setResponsePage(SecondPage.class);
            }
        };
        queue(form);

        add(new Link<Void>("mylink") {
            @Override
            public void onClick() {
                setResponsePage(SecondPage.class);
            }
        });
    }
}
