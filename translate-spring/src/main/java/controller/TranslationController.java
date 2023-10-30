package controller;

import data.TranslationRequest;
import data.TranslationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

    @PostMapping("/translate")
    public ResponseEntity<TranslationResponse> translate(@RequestBody TranslationRequest request){

        TranslationResponse response = libreTranslationService.translate(request.getText(), request.getDetectedLanguage());
        return ResponseEntity.ok(response);
    }


}
