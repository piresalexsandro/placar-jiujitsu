package Utils;

import Utils.Loader;
import model.Atleta;

public class Mirim {

    public static String getDescriptionCategoryByWeightMale(String category, double weight) {

        String description = null;

        if (weight <= 18) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 18 && weight <= 20) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 20 && weight <= 23) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 23 && weight <= 26) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 26 && weight <= 29.3) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 29.3 && weight <= 32.3) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 32.3 && weight <= 35.5) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 35.5 && weight <= 38.5) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 38.5 && weight <= 44) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 44) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double weight) {
        String description = null;

        if (weight <= 16) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 16 && weight <= 18) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 18 && weight <= 21) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 21 && weight <= 24) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 24 && weight <= 27) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 27 && weight <= 30.5) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 30.5 && weight <= 33.3) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 33.3 && weight <= 36.3) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 36.3 && weight <= 40) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 40) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;

    }
}
