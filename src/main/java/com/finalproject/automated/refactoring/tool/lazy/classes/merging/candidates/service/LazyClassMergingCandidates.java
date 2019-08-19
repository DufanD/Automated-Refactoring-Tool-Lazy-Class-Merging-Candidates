package com.finalproject.automated.refactoring.tool.lazy.classes.merging.candidates.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface LazyClassMergingCandidates {
    ClassModel searchTarget(@NonNull List<ClassModel> classes, @NonNull ClassModel lazyClass);

    List<ClassModel> searchTarget(@NonNull List<ClassModel> classes, @NonNull List<ClassModel> lazyClasses);
}
