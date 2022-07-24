package service;

import Utils.*;

public class ObterDadosDaCategoriaPorPeso {

    static String getDescricao(String category, String genre, double weight) {
        String byWeight = null;
        genre = genre.trim().toUpperCase();

        switch (category){
            case "Pre Mirim":
                if (genre.equals("M")) {
                    byWeight = PreMirim.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = PreMirim.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Mirim":
                if (genre.equals("M")) {
                    byWeight = Mirim.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = Mirim.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Infantil A":
                if (genre.equals("M")) {
                    byWeight = InfantilA.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = InfantilA.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Infantil B":
                if (genre.equals("M")) {
                    byWeight = InfantilB.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = InfantilB.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Infanto Juvenil A":
                if (genre.equals("M")) {
                    byWeight = InfantoJuvenilA.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = InfantoJuvenilA.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Infanto Juvenil B":
                if (genre.equals("M")) {
                    byWeight = InfantoJuvenilB.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = InfantoJuvenilB.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Juvenil":
                if (genre.equals("M")) {
                    byWeight = Juvenil.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = Juvenil.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Adulto":
                if (genre.equals("M")) {
                    byWeight = Adulto.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = Adulto.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            case "Master 1":
            case "Master 2":
            case "Master 3":
            case "Master 4":
            case "Master 5":
            case "Master 6":
                if (genre.equals("M")) {
                    byWeight = Master.getDescriptionCategoryByWeightMale(category, weight);
                }else{
                    byWeight = Master.getDescriptionCategoryByWeightFemale(category, weight);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + category);
        }
        
        return byWeight;
    }


}
