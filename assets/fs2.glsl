varying vec4 pos;
uniform float r;
uniform float g;
uniform float b;

struct light{
  vec4 color;
  vec3 position;
};

void main(void){
  vec4 color=vec4(r,g,b,0.0);
  
  vec4 black=vec4(0.0,0.0,0.0,1.0);

  vec4 white=vec4(1.0);

  float ambient=0.02;
  float r=0.09;
  float odl=length(pos.xy);
  if(odl>=r){
    gl_FragColor=black;
    discard;
    return;
  }
  
  light lightcolor=light(color,vec3(-1.0,1.0,2.0));
  vec3 q=(pos.xyz);
  q.z=sqrt(1.0-q.x*q.x-q.y*q.y);
  vec3 p=lightcolor.position-q;
  p=normalize(p);
  float val=dot(p,q);
  val=clamp(val,0.0,1.0);
  vec4 mat=white;
  vec4 col=mat*lightcolor.color*val+ambient;
  gl_FragColor=col;
}