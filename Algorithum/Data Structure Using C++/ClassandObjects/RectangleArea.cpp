/*
 * Create classes Rectangle and RectangleArea
 */
 class Rectangle
 {
    public:
    int width,height;
    void read_input()
    {
        cin>>width>>height;
    }
    
    /*
     * Print the width and height
     */
    void display()
    {
        cout<<width<<" "<<height<<endl;
    }
    
    /*
     * Print the area
     */
    
 };
 
 class RectangleArea :public Rectangle
 {
     public:
     void display()
    {
        cout<<width*height<<endl;
    }
 };

