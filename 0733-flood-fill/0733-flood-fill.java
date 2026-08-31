class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int OGcolor = image[sr][sc];

        if(OGcolor != color) result(image, sr, sc, OGcolor, color);

        return image;
        
    }
    private void result(int[][] InImage, int InR, int InC, int InOGColor, int InNewColor){
        if(InR < 0 || InR >= InImage.length || InC < 0 || InC >= InImage[0].length) return;

        if(InImage[InR][InC] != InOGColor) return;

        InImage[InR][InC] = InNewColor;

        result(InImage, InR -1, InC, InOGColor, InNewColor);
        result(InImage, InR +1, InC, InOGColor, InNewColor);
        result(InImage, InR, InC -1, InOGColor, InNewColor);
        result(InImage, InR, InC +1, InOGColor, InNewColor);
    }
}