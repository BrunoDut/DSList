package com.devSuperior.DSList.dto;

public class ReplacmentDTO {
    private int sourceIndex ;
    private int destinationIndex ;
    
    public ReplacmentDTO(int sourceIndex, int destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public ReplacmentDTO() {
    }

    public int getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(int sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public int getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(int destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
