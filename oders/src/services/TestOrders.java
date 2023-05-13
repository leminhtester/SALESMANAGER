package services;

import java.util.ArrayList;
import java.util.Scanner;

import models.*;
public class TestOrders {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Products> productList = new ArrayList<>(); 
		ArrayList<Customer> customers = new ArrayList<>();
		Oders order = new Oders();
		
		Products newProduct_1 = new Products("01", "milk", "Mo ta san pham 1", 10.0f, 10);
		productList.add(newProduct_1);
        Products newProduct_2 = new Products("02", "tea", "Mo ta san pham 2", 20.0f, 20);
        productList.add(newProduct_2);
		
        Customer customer1 = new Customer("KH001", "Nguyen Van A", "Ha Noi", "0987654321", "nguyenvana@gmail.com");
        Customer customer2 = new Customer("KH002", "Tran Thi B", "Ho Chi Minh", "0123456789", "tranthib@gmail.com");
        Customer customer3 = new Customer("04", "Le Thi Minh", "Thanh Hoa", "0969685372", "lethiminh279@gmail.com");
        Customer.addCustomer(customer1);
        Customer.addCustomer(customer2);
        Customer.addCustomer(customer3);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

 
		while(true) {
			System.out.println("****** QUAN LY BAN HANG ONLINE ******");
			System.out.println("1. Quan ly san pham");
            System.out.println("2. Quan ly khach hang");
            System.out.println("3. Quan ly don hang");
            System.out.println("4. Tat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch(choice) {
	            case 1:
	            	boolean flag = false;
	            	while(true) {
	            		System.out.println("****** QUAN LY SAN PHAM ******");
	                	System.out.println("1. Them san pham");
	                    System.out.println("2. Xoa san pham");
	                    System.out.println("3. Hien thi danh sach san pham");
	                    System.out.println("4. Thoat");
	                    System.out.print("Chon chuc nang: ");
	                    int choice_1 = scanner.nextInt();
	                    scanner.nextLine();
	                    switch(choice_1) {
		                    case 1:
		                    	System.out.print("Nhap ID san pham: ");
		                        String id = scanner.nextLine();
		                        System.out.print("Nhap ten san pham: ");
		                        String tenSP = scanner.nextLine();
		                        System.out.print("Nhap mo ta ve san pham: ");
		                        String moTa = scanner.nextLine();
		                        System.out.print("Nhap gia: ");
		                        float giaSP = scanner.nextFloat();
		                        System.out.print("Nhap so luong: ");
		                        int soLuongSP = scanner.nextInt();
		                        scanner.nextLine(); 
		
		                        Products newProduct = new Products(id, tenSP, moTa, giaSP, soLuongSP);
		                        productList.add(newProduct);
		                        System.out.println("Da them san pham: " + newProduct);
		                        break;
		                    case 2:
		                    	 System.out.print("Nhap ID san pham can xoa: ");
		                         String idToRemove = scanner.nextLine();
		                         boolean found = false;

		                         // Duyệt qua danh sách sản phẩm để tìm sản phẩm cần xóa
		                         for (Products product : productList) {
		                             if (product.getID().equals(idToRemove)) {
		                                 productList.remove(product);
		                                 System.out.println("Da xoa san pham: " + product);
		                                 found = true;
		                                 break;
		                             }
		                         }

		                         if (!found) {
		                             System.out.println("Khong tim thay san pham co ID = " + idToRemove);
		                         }
		                         break;
		                    case 3:
		                    	System.out.println("Danh sach san pham:");
		                        for (Products product : productList) {
		                        	System.out.print("Ma san pham: ");
		                        	System.out.println(product.getID());		                    
		                            System.out.print("Ten san pham: ");
		                            System.out.println(product.getTenSP());
		                            System.out.print("Mo ta san pham: ");
		                            System.out.println(product.getMoTa());
		                            System.out.print("Gia cua san pham: ");
		                            System.out.println(product.getGiaSP());
		                            System.out.print("So luong san pham: ");
		                            System.out.println(product.getSoLuongSP());
		                        }
		                        break;
		                    case 4:
		                    	flag = true;
		                    	break;
		                    default:
		                        System.out.println("Lua chon khong hop le vui long chon lai.");
		                        break;
	                    }
	                    if (flag) {
		                	break;
		                }
	            	}
	            	break;
	            	
	            case 2:
	            	boolean flag_2 = false;
	            	while(true) {
	            		System.out.println("****** QUAN LY KHACH HANG ******");
		            	System.out.println("1. Them khach hang");
		                System.out.println("2. Sua thong tin khach hang");
		                System.out.println("3. Hien thi danh sach khach hang");
		                System.out.println("4. Tim kiem khach hang");
		                System.out.println("5. Thoat");
		                System.out.print("Chon chuc nang: ");
		                //switch case để chọn chức năng
		                int choice_2 = scanner.nextInt();
	                    scanner.nextLine();
	                    switch (choice_2) {
	                    case 1:
	                    	System.out.print("Nhap ma KH: ");
	                        String maKH = scanner.nextLine();
	                        System.out.print("Nhap ten KH: ");
	                        String tenKH = scanner.nextLine();
	                        System.out.print("Nhap di chi: ");
	                        String diaChi = scanner.nextLine();
	                        System.out.print("Nhap so dien thoai: ");
	                        String soDienThoai = scanner.nextLine();
	                        System.out.print("Nhap email: ");
	                        String email = scanner.nextLine();
	                        Customer customer = new Customer(maKH, tenKH, diaChi, soDienThoai, email);
	                        customers.add(customer);
	                        break;
	                    case 2:
	                    	System.out.print("Nhap ma KH can sua: ");
	                        String maKHCanSua = scanner.nextLine();
	                        for (Customer c : customers) {
	                            if (c.getMaKH().equals(maKHCanSua)) {
	                                System.out.print("Nhap ten moi: ");
	                                String tenMoi = scanner.nextLine();
	                                System.out.print("Nhap dia chi moi: ");
	                                String diaChiMoi = scanner.nextLine();
	                                System.out.print("Nhap so dien thoai moi: ");
	                                String soDienThoaiMoi = scanner.nextLine();
	                                System.out.print("Nhap email moi: ");
	                                String emailMoi = scanner.next();
	                                c.setTenKH(tenMoi);
	                                c.setDiaChi(diaChiMoi);
	                                c.setSoDienThoai(soDienThoaiMoi);
	                                c.setEmail(emailMoi);
	                                System.out.println("Thong tin khach hang da duoc sua thanh cong!");
	                                break;
	                            }
	                        }
	                        break;
	                    case 3:
	                        System.out.println("Danh sach khach hang:");
	                        for (Customer c : customers) {
	                        	System.out.print("Ma khach hang: ");
	                            System.out.println(c.getMaKH());
	                            System.out.print("Ten khach hang: ");
	                            System.out.println(c.getTenKH());
	                            System.out.print("Dia chi cua khach hang: ");
	                            System.out.println(c.getDiaChi());
	                            System.out.print("So dien thoai khach hang: ");
	                            System.out.println(c.getSoDienThoai());
	                            System.out.print("Email khach hang: ");
	                            System.out.println(c.getEmail());
	                        }
	                        break;
	                    case 4:
	                    	System.out.print("Nhap ten khach hang can tim kiem: ");
	                        String name = scanner.nextLine();	                        
	                        // Tìm khách hàng theo tên
	                        Customer.findCustomerByName(name);	            
	                        
	                        break;

	                    case 5:
	                    	flag_2 = true;
	                    	break;
	                    default:
	                        System.out.println("Lua chon khong hop le vui long chon lai.");
	                        break;
	                    }
	                    if (flag_2) {
		                	break;
		                }
	            	}	
	            	break;
	            case 3:
	            	boolean flag_3 = false;
	            	while(true) {
	            		System.out.println("****** QUAN LY DON HANG ******");
	            		System.out.println("1. Tao don hang");
	    	            System.out.println("2. Xoa don hang");
	    	            System.out.println("3. Cap nhat don hang");
	    	            System.out.println("4. Xem danh sach don hang");
	    	            System.out.println("5. Thoat");
		                System.out.print("Chon chuc nang: ");
		                int choice_3 = scanner.nextInt();
	                    scanner.nextLine();
	                    switch(choice_3) {
	                    case 1:
	                    	System.out.print("Don hang co bao nhieu san pham: ");
		                	int n = scanner.nextInt();
		                	for (int i = 0;i<n;i++) {
		                		System.out.print("Nhap ten san pham: ");
		                		String tenSanPham = scanner.next();
		                		System.out.print("Nhap so luong san pham: ");
		                		int soLuong = scanner.nextInt();
		                		System.out.print("Tong gia tri don hang: ");
		                		double giaDonHang = scanner.nextDouble();
//		                		List<Product> productList1 = new ArrayList<Product>();
		                		order.taoDonHang(tenSanPham, soLuong, giaDonHang, productList);
		                    	
		                	}
		                	break;
	                    case 2:
	                    	System.out.print("Nhap ma don hang can xoa: ");
		                    int index = scanner.nextInt();
		                    order.xoaDonHang(index);
		                    break;
	                    case 3:
	                    	System.out.print("Nhap ma don hang can sua: ");
		                    int indexSua = scanner.nextInt();
		                    System.out.print("Nhap ten san pham moi: ");
		                    String tenSanPhamMoi = scanner.next();
		                    System.out.print("Nhap so luong moi: ");
		                    int soLuongMoi = scanner.nextInt();
		                    System.out.print("Nhap tong gia moi: ");
		                    double giaDonHangMoi = scanner.nextDouble();
		                    order.suaDonHang(indexSua, tenSanPhamMoi, soLuongMoi, giaDonHangMoi);
		                    break;
	                    case 4:
	                    	order.xemDanhSachSanPham();
		                    break;
	                    case 5:
	                    	flag_3 = true;
	                    	break;
	                    
	                    default:
	                        System.out.println("Lua chon khong hop le vui long chon lai.");
	                        break;
	                    }
	                    if (flag_3) {
		                	break;
		                }
	            	}   	
	                break;
	            case 4:
	            	System.out.println("************ CHUONG TRINH DA TAT ************");
	            	scanner.close();
                    System.exit(0);
	            default:
	                System.out.println("Lua chon khong hop le. Vui long chon lai.");
	                break;
            }
		}
	}
	

}
