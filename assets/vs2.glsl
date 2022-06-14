varying vec4 pos;


void main(void)
{
  
 pos=gl_Vertex/0.2f;
 gl_Position=gl_ModelViewProjectionMatrix*gl_Vertex;

}