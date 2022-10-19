package com.amitb.service;

import com.amitb.domain.Preference;
import com.amitb.repository.PreferenceRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class PreferenceService {

    private final PreferenceRepository preferenceRepository;

    @Inject
    public PreferenceService(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    public Preference findByUserId(Integer userId) {
        return preferenceRepository.findByUserId(userId)
                .orElse(null);
    }

    public Preference createPreference(Preference preference) {
        return preferenceRepository.save(preference);
    }
}
