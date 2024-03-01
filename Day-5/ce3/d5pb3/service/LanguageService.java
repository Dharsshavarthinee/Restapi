package com.example.d5pb3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d5pb3.model.Language;
import com.example.d5pb3.repository.LanguageRepo;

@Service
public class LanguageService {
    @Autowired
    LanguageRepo lRepo;


    public Language postLang(Language l)
    {
        return lRepo.save(l);
    }

    public List<Language> getLang()
    {
        return lRepo.findAll();
    }

    public Optional<Language> getLangById(int languageId)
    {
        return lRepo.findById(languageId);
    }

    public Language editLang(Language l,int languageId)
    {
        Language avail=lRepo.findById(languageId).orElse(null);

        if(avail!=null)
        {
            avail.setLanguageId(l.getLanguageId());
            avail.setLanguageName(l.getLanguageName());
            avail.setLanguageComplexity(l.getLanguageComplexity());

            return lRepo.saveAndFlush(avail);
        }
        else{
            return null;
        }
    }

    public String delLang(int languageId)
    {
        lRepo.deleteById(languageId);
        return ("deleted lang");
    }

}
