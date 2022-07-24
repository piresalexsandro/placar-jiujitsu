package Utils;

import Utils.Loader;
import model.Atleta;

public class InfantilB {

    public static String getDescriptionCategoryByWeightMale(String category, double weight) {

        String description = null;

        if (weight <= 29.3) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 29.3 && weight <= 32.3) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 32.3 && weight <= 35.5) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 35.5 && weight <= 38.5) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 38.5 && weight <= 41.7) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 41.7 && weight <= 44.7) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 44.7 && weight <= 47.7) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 44.7 && weight <= 51) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 51 && weight <= 55) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 55) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double weight) {
        String description = null;

        if (weight <= 23) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 23 && weight <= 26) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 26 && weight <= 29.3) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 29.3 && weight <= 32.3) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 32.3 && weight <= 35.5) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 35.5 && weight <= 38.5) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 38.5 && weight <= 41.7) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 41.7 && weight <= 44.7) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 44.7 && weight <= 48) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 48) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;

    }
}
