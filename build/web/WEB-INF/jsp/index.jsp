<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div id="main-wrapper">
            <jsp:include page="header.jsp"></jsp:include><br/><br/>
            <jsp:include page="left-sidebar.jsp"></jsp:include>
            <div class="page-wrapper">
                <div class="container-fluid">
                    <!-- Start Page Content -->
                    <div class="row">
                        <div class="col-md-3">
                            <div class="card p-30">
                                <div class="media">
                                    <div class="media-left meida media-middle">
                                        <span><i class="fa fa-usd f-s-40 color-primary"></i></span>
                                    </div>
                                    <div class="media-body media-text-right">
                                        <h2>568120</h2>
                                        <p class="m-b-0">Thống kê doanh thu</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card p-30">
                                <div class="media">
                                    <div class="media-left meida media-middle">
                                        <span><i class="fa fa-shopping-cart f-s-40 color-success"></i></span>
                                    </div>
                                    <div class="media-body media-text-right">
                                        <h2>1178</h2>
                                        <p class="m-b-0">Thống kê đơn hàng</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card p-30">
                                <div class="media">
                                    <div class="media-left meida media-middle">
                                        <span><i class="fa fa-archive f-s-40 color-warning"></i></span>
                                    </div>
                                    <div class="media-body media-text-right">
                                        <h2>25</h2>
                                        <p class="m-b-0">Thống kê hàng hóa</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card p-30">
                                <div class="media">
                                    <div class="media-left meida media-middle">
                                        <span><i class="fa fa-user f-s-40 color-danger"></i></span>
                                    </div>
                                    <div class="media-body media-text-right">
                                        <h2>847</h2>
                                        <p class="m-b-0">Thống kê nhân viên</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- End PAge Content -->
                </div>
            </div>
        </div>
        <footer class="footer"> © 2018 All rights reserved. Template designed by Ấu đoàn Poly</footer>
        <script src="abc/js/lib/jquery/jquery.min.js"></script>
        <!-- Bootstrap tether Core JavaScript -->
        <script src="abc/js/lib/bootstrap/js/popper.min.js"></script>
        <script src="abc/js/lib/bootstrap/js/bootstrap.min.js"></script>
        <!-- slimscrollbar scrollbar JavaScript -->
        <script src="abc/js/jquery.slimscroll.js"></script>
        <!--Menu sidebar -->
        <script src="abc/js/sidebarmenu.js"></script>
        <!--stickey kit -->
        <script src="abc/js/lib/sticky-kit-master/dist/sticky-kit.min.js"></script>
        <!--Custom JavaScript -->
        <script src="abc/js/custom.min.js"></script>


        <script src="abc/js/lib/datatables/datatables.min.js"></script>
        <script src="abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js"></script>
        <script src="abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.flash.min.js"></script>
        <script src="abc/js/lib/datatables/cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
        <script src="abc/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
        <script src="abc/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
        <script src="abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js"></script>
        <script src="abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.print.min.js"></script>
        <script src="abc/js/lib/datatables/datatables-init.js"></script>
        
    </body>
</html>
