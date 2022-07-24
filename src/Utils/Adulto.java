package Utils;

import Utils.Loader;

public class Adulto {

    public static String getDescriptionCategoryByWeightMale(String category, double weight) {

        String description = null;

        if (weight <= 58) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 58 && weight <= 64) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 64 && weight <= 70) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 70 && weight <= 76) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 76 && weight <= 82.3) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 82.3 && weight <= 88.3) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 88.3 && weight <= 94.3) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 94.3 && weight <= 100.5) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 100.5) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double weight) {
        String description = null;

        if (weight <= 53.5) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 53.5 && weight <= 58.5) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 58.5 && weight <= 64) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 64 && weight <= 69) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 69 && weight <= 74) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 74 && weight <= 80) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 80 && weight <= 85) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 85) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }

        return description;

    }
}
