package Utils;

import Utils.Loader;
import model.Atleta;

public class PreMirim {

    public static String getDescriptionCategoryByWeightMale(String category, double peso) {

        String description = null;

        if (peso <= 17) {
            description = Loader.loadCategoryGalo().get(category);
        }

        if (peso > 17 && peso <= 19) {
            description = Loader.loadCategoryPluma().get(category);
        }

        if (peso > 19 && peso <= 22) {
            description = Loader.loadCategoryPena().get(category);
        }

        if (peso > 22 && peso <= 25) {
            description = Loader.loadCategoryLeve().get(category);
        }

        if (peso > 25 && peso <= 28.3) {
            description = Loader.loadCategoryMedio().get(category);
        }

        if (peso > 28.3 && peso <= 31.3) {
            description = Loader.loadCategoryMeioPesado().get(category);
        }

        if (peso > 31.3 && peso <= 34.5) {
            description = Loader.loadCategoryPesado().get(category);
        }

        if (peso > 34.5 && peso <= 37.5) {
            description = Loader.loadCategorySuperPesado().get(category);
        }

        if (peso > 37.5 && peso <= 42.5) {
            description = Loader.loadCategoryPesadissimo().get(category);
        }
        if (peso > 42.5) {
            description = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return description;
    }

    public static String getDescriptionCategoryByWeightFemale(String category, double peso) {
        String descricao = null;

        if (peso <= 15) {
            descricao = Loader.loadCategoryGalo().get(category);
        }

        if (peso > 15 && peso <= 17) {
            descricao = Loader.loadCategoryPluma().get(category);
        }

        if (peso > 17 && peso <= 20) {
            descricao = Loader.loadCategoryPena().get(category);
        }

        if (peso > 20 && peso <= 23) {
            descricao = Loader.loadCategoryLeve().get(category);
        }

        if (peso > 23 && peso <= 26) {
            descricao = Loader.loadCategoryMedio().get(category);
        }

        if (peso > 26 && peso <= 29.5) {
            descricao = Loader.loadCategoryMeioPesado().get(category);
        }

        if (peso > 29.5 && peso <= 32.3) {
            descricao = Loader.loadCategoryPesado().get(category);
        }

        if (peso > 32.3 && peso <= 35.3) {
            descricao = Loader.loadCategorySuperPesado().get(category);
        }

        if (peso > 35.3 && peso <= 38.5) {
            descricao = Loader.loadCategoryPesadissimo().get(category);
        }
        if (peso > 38.5) {
            descricao = Loader.loadCategoryExtraPesadissimo().get(category);
        }

        return descricao;

    }
}
