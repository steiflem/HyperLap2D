package games.rednblack.editor.renderer.components;

import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.PolygonSprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.EarClippingTriangulator;
import com.badlogic.gdx.math.Vector2;
import games.rednblack.editor.renderer.utils.PolygonUtils;

public class TextureRegionComponent implements BaseComponent {
	public String regionName = "";
	public TextureRegion region = null;
    public boolean isRepeat = false;
    public boolean isPolygon = false;

    // optional
    public PolygonSprite polygonSprite = null;

    public void setPolygonSprite(PolygonComponent polygonComponent, float pixelToWorld, float scaleX, float scaleY) {
        Vector2[] verticesArray = PolygonUtils.mergeTouchingPolygonsToOne(polygonComponent.vertices);
        float[] vertices = new float[verticesArray.length*2];
        for(int i  = 0; i < verticesArray.length; i++) {
            vertices[i*2] = verticesArray[i].x*pixelToWorld * scaleX;
            vertices[i*2+1] = verticesArray[i].y*pixelToWorld * scaleY;
        }
        
        EarClippingTriangulator triangulator = new EarClippingTriangulator();
        short[] triangles = triangulator.computeTriangles(vertices).toArray();
        
        PolygonRegion polygonRegion = new PolygonRegion(region, vertices, triangles);
        polygonSprite = new PolygonSprite(polygonRegion);
    }

    @Override
    public void reset() {
        regionName = "";
        region = null;
        isRepeat = false;
        isPolygon = false;
    }
}
