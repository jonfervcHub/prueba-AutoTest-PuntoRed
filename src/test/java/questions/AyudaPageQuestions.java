package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.ayudaPage.AyudaPageForm;

public class AyudaPageQuestions {
    public static Question<String> textoItem(){
        return actor -> TextContent.of(AyudaPageForm.textoItemMenuAyudaPage).viewedBy(actor).asString();
    }
}
