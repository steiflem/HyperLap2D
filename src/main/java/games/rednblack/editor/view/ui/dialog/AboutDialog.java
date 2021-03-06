package games.rednblack.editor.view.ui.dialog;

import com.badlogic.gdx.utils.Align;
import com.kotcrab.vis.ui.VisUI;
import com.kotcrab.vis.ui.widget.LinkLabel;
import com.kotcrab.vis.ui.widget.VisImage;
import com.kotcrab.vis.ui.widget.VisScrollPane;
import com.kotcrab.vis.ui.widget.VisTable;
import games.rednblack.editor.utils.AppConfig;
import games.rednblack.h2d.common.view.ui.StandardWidgetsFactory;
import games.rednblack.h2d.common.H2DDialog;

public class AboutDialog extends H2DDialog {

    public AboutDialog() {
        super("About HyperLap2D");
        addCloseButton();

        VisTable mainTable = new VisTable();
        VisTable leftTable = new VisTable();
        VisTable contentTable = new VisTable();
        contentTable.align(Align.left);
        VisScrollPane scrollPane = StandardWidgetsFactory.createScrollPane(contentTable);
        scrollPane.setFadeScrollBars(false);

        mainTable.add(leftTable).top().padLeft(10).left();
        mainTable.add(scrollPane).maxHeight(280).top().width(450).padLeft(28).expand().left();

        leftTable.add(new VisImage(VisUI.getSkin().getDrawable("splash_logo"))).pad(5).row();
        leftTable.add("HyperLap2D").padLeft(5).padRight(5).row();
        leftTable.add("Release " + AppConfig.getInstance().version).row();

        contentTable.add("Copyright \u00A9 2020 Red & Black Games").left().row();
        contentTable.add("").row();
        contentTable.add("Dedicated to game lovers. Create something awesome!").left().row();
        contentTable.add("").row();
        contentTable.add("HyperLap2D is based on following libraries and open source tools:").left().row();
        contentTable.add(new LinkLabel("- LibGDX [https://github.com/libgdx/libgdx]", "https://github.com/libgdx/libgdx")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Ashley [https://github.com/libgdx/ashley]", "https://github.com/libgdx/ashley")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Box2DLights [https://github.com/libgdx/box2dlights]", "https://github.com/libgdx/box2dlights")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Overlap2D [https://github.com/UnderwaterApps/overlap2d]", "https://github.com/UnderwaterApps/overlap2d")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- PureMVC Framework [https://puremvc.org]", "https://puremvc.org/")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- VisUI [https://github.com/kotcrab/vis-ui]", "https://github.com/kotcrab/vis-ui")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Modular [https://github.com/mountainblade/modular]", "https://github.com/mountainblade/modular")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Spine Runtime [https://github.com/EsotericSoftware/spine-runtimes]", "https://github.com/EsotericSoftware/spine-runtimes")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Spriter [https://github.com/Trixt0r/spriter]", "https://github.com/Trixt0r/spriter")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- LibGDX Spriter [https://github.com/Trixt0r/gdx-spriter]", "https://github.com/Trixt0r/gdx-spriter")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Physics Body Editor [https://www.aurelienribon.com]", "https://www.aurelienribon.com")).padLeft(6).left().row();
        contentTable.add(new LinkLabel("- Typing Label [https://github.com/rafaskb/typing-label]", "https://github.com/rafaskb/typing-label")).padLeft(6).left().row();
        contentTable.add("\n").row();
        contentTable.add("Contributors").row();
        contentTable.add("").row();
        contentTable.add("Programmer: Francesco Marongiu").left().row();
        contentTable.add("").row();
        contentTable.add("Icon and Art design: Angelo Navarro").left().row();

        getContentTable().add(mainTable).padTop(5);
    }
}
