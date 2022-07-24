package Utils;

import Utils.Loader;

public class Juvenil {

    public static String getDescriptionCategoryByWeightMale(String category, double weight) {

        String description = null;

        if (weight <= 53.5) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 53.5 && weight <= 58.5) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 58.5 && weight <= 64) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 64 && weight <= 69) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 69 && weight <= 74) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 74 && weight <= 79.3) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 79.3 && weight <= 84.3) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 84.3 && weight <= 89.3) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 89.3) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double weight) {
        String description = null;

        if (weight <= 43.7) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 43.7 && weight <= 48) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 48 && weight <= 52.5) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 52.5 && weight <= 56.5) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 56.5 && weight <= 60.5) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 60.5 && weight <= 65) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 65 && weight <= 69) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 69 && weight <= 73) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 73) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }

        return description;

    }
}
