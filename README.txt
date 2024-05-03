Service "Authorizer" này gồm các chức năng:
- Đăng ký user với các role [user, mod, admin]
- Đăng nhập trả về jwt
- Xác thực bằng jwt
- Refresh token
- Một số chức năng dùng để test như lấy thông tin public, lấy thông tin user, lấy thông tin mod, lấy thông tin admin
- Chức năng thêm sửa xóa tìm kiếm CRUD thông tin của tutorials

Đã nhét các role của user vào trong chuỗi JWT, các service khác dùng chuỗi JWT đó có thể lấy thông tin role ra để validate.