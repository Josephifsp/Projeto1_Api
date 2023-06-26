package br.edu.ifsp.aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WineResponse {
    private List<Wine> recommendedWines;
    private int totalFound;

    private List<String> pairedWines;
    private String pairingText;
    private List<Wine> productMatches;

    public List<String> getPairedWines() {
        return pairedWines;
    }

    public void setPairedWines(List<String> pairedWines) {
        this.pairedWines = pairedWines;
    }

    public String getPairingText() {
        return pairingText;
    }

    public void setPairingText(String pairingText) {
        this.pairingText = pairingText;
    }

    public List<Wine> getProductMatches() {
        return productMatches;
    }

    public void setProductMatches(List<Wine> productMatches) {
        this.productMatches = productMatches;
    }

    public List<Wine> getRecommendedWines() {
        return recommendedWines;
    }

    public void setRecommendedWines(List<Wine> recommendedWines) {
        this.recommendedWines = recommendedWines;
    }

    public int getTotalFound() {
        return totalFound;
    }

    public void setTotalFound(int totalFound) {
        this.totalFound = totalFound;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WineResponse [");
        if (recommendedWines != null && !recommendedWines.isEmpty()) {
            sb.append("recommendedWines=").append(recommendedWines).append(", ");
        }
        if (totalFound != 0) {
            sb.append("totalFound=").append(totalFound).append(", ");
        }
        if (pairedWines != null && !pairedWines.isEmpty()) {
            sb.append("pairedWines=").append(pairedWines).append(", ");
        }
        if (pairingText != null && !pairingText.isEmpty()) {
            sb.append("pairingText=").append(pairingText).append(", ");
        }
        if (productMatches != null && !productMatches.isEmpty()) {
            sb.append("productMatches=").append(productMatches);
        }
        sb.append("]");
        return sb.toString();
    }
}
