package Utils;

import Utils.Loader;
import model.Atleta;

public class InfantoJuvenilB {

    public static String getDescriptionCategoryByWeightMale(String category, double weight) {

        String description = null;

        if (weight <= 44) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 44 && weight <= 48) {
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

        if (weight > 60.5 && weight <= 64.5) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 31.3 && weight <= 69) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 69 && weight <= 73) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 73 && weight <= 77) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 77) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double weight) {
        String description = null;

        if (weight <= 35.5) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (weight > 35.5 && weight <= 39.5) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (weight > 39.5 && weight <= 43.3) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (weight > 43.7 && weight <= 48) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (weight > 48 && weight <= 52.5) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (weight > 52.5 && weight <= 56.5) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (weight > 56.5 && weight <= 60.5) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (weight > 60.5 && weight <= 65) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (weight > 65 && weight <= 69) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (weight > 69) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;

    }
}
