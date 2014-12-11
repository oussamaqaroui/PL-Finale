<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta charset="utf-8">

        <title>ProUI - Responsive Bootstrap Admin Template</title>

        <meta name="description" content="ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.">
        <meta name="author" content="pixelcave">
        <meta name="robots" content="noindex, nofollow">

        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0">

        <!-- Icons -->
        <!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->
        <link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/img/favicon.ico">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon57.png" sizes="57x57">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon72.png" sizes="72x72">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon76.png" sizes="76x76">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon114.png" sizes="114x114">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon120.png" sizes="120x120">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon144.png" sizes="144x144">
        <link rel="apple-touch-icon" href="<%=request.getContextPath()%>/resources/img/icon152.png" sizes="152x152">
        <!-- END Icons -->

        <!-- Stylesheets -->
        <!-- Bootstrap is included in its original form, unaltered -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">

        <!-- Related styles of various icon packs and plugins -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/plugins.css">

        <!-- The main stylesheet of this template. All Bootstrap overwrites are defined in here -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css">

        <!-- Include a specific file here from css/themes/ folder to alter the default theme of the template -->

        <!-- The themes stylesheet of this template (for using specific theme color in individual elements - must included last) -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/themes.css">
        <!-- END Stylesheets -->

        <!-- Modernizr (browser feature detection library) & Respond.js (Enable responsive CSS code on browsers that don't support it, eg IE8) -->
        <script src="<%=request.getContextPath()%>/js/vendor/modernizr-2.7.1-respond-1.4.2.min.js"></script>
    </head>
    <!-- In the PHP version you can set the following options from inc/config file -->
    <!--
        Available body classes:

        'page-loading'      enables page preloader
    -->
    <body>
        <!-- Preloader -->
        <!-- Preloader functionality (initialized in js/app.js) - pageLoading() -->
        <!-- Used only if page preloader is enabled from inc/config (PHP version) or the class 'page-loading' is added in body element (HTML version) -->
        <div class="preloader themed-background">
            <h1 class="push-top-bottom text-light text-center"><strong>Pro</strong>UI</h1>
            <div class="inner">
                <h3 class="text-light visible-lt-ie9 visible-lt-ie10"><strong>Loading..</strong></h3>
                <div class="preloader-spinner hidden-lt-ie9 hidden-lt-ie10"></div>
            </div>
        </div>
        <!-- END Preloader -->

        <!-- Page Container -->
        <!-- In the PHP version you can set the following options from inc/config file -->
        <!--
            Available #page-container classes:

            '' (None)                                       for a full main and alternative sidebar hidden by default (> 991px)

            'sidebar-visible-lg'                            for a full main sidebar visible by default (> 991px)
            'sidebar-partial'                               for a partial main sidebar which opens on mouse hover, hidden by default (> 991px)
            'sidebar-partial sidebar-visible-lg'            for a partial main sidebar which opens on mouse hover, visible by default (> 991px)

            'sidebar-alt-visible-lg'                        for a full alternative sidebar visible by default (> 991px)
            'sidebar-alt-partial'                           for a partial alternative sidebar which opens on mouse hover, hidden by default (> 991px)
            'sidebar-alt-partial sidebar-alt-visible-lg'    for a partial alternative sidebar which opens on mouse hover, visible by default (> 991px)

            'sidebar-partial sidebar-alt-partial'           for both sidebars partial which open on mouse hover, hidden by default (> 991px)

            'sidebar-no-animations'                         add this as extra for disabling sidebar animations on large screens (> 991px) - Better performance with heavy pages!

            'style-alt'                                     for an alternative main style (without it: the default style)
            'footer-fixed'                                  for a fixed footer (without it: a static footer)

            'disable-menu-autoscroll'                       add this to disable the main menu auto scrolling when opening a submenu

            'header-fixed-top'                              has to be added only if the class 'navbar-fixed-top' was added on header.navbar
            'header-fixed-bottom'                           has to be added only if the class 'navbar-fixed-bottom' was added on header.navbar
        -->
        <div id="page-container" class="sidebar-partial sidebar-visible-lg sidebar-no-animations">
            <!-- Alternative Sidebar -->
            <div id="sidebar-alt">
                <!-- Wrapper for scrolling functionality -->
                <div class="sidebar-scroll">
                    <!-- Sidebar Content -->
                    <div class="sidebar-content">
                        <!-- Chat -->
                        <!-- Chat demo functionality initialized in js/app.js -> chatUi() -->
                        <a href="page_ready_chat.html" class="sidebar-title">
                            <i class="gi gi-comments pull-right"></i> <strong>Chat</strong>UI
                        </a>
                        <!-- Chat Users -->
                        <ul class="chat-users clearfix">
                            <li>
                                <a href="javascript:void(0)" class="chat-user-online">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar12.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-online">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar15.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-online">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar10.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-online">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar4.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-away">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar7.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-away">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar9.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="chat-user-busy">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar16.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar1.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar4.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar3.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar13.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <span></span>
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar5.jpg" alt="avatar" class="img-circle">
                                </a>
                            </li>
                        </ul>
                        <!-- END Chat Users -->

                        <!-- Chat Talk -->
                        <div class="chat-talk display-none">
                            <!-- Chat Info -->
                            <div class="chat-talk-info sidebar-section">
                                <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar5.jpg" alt="avatar" class="img-circle pull-left">
                                <strong>John</strong> Doe
                                <button id="chat-talk-close-btn" class="btn btn-xs btn-default pull-right">
                                    <i class="fa fa-times"></i>
                                </button>
                            </div>
                            <!-- END Chat Info -->

                            <!-- Chat Messages -->
                            <ul class="chat-talk-messages">
                                <li class="text-center"><small>Yesterday, 18:35</small></li>
                                <li class="chat-talk-msg animation-slideRight">Hey admin?</li>
                                <li class="chat-talk-msg animation-slideRight">How are you?</li>
                                <li class="text-center"><small>Today, 7:10</small></li>
                                <li class="chat-talk-msg chat-talk-msg-highlight themed-border animation-slideLeft">I'm fine, thanks!</li>
                            </ul>
                            <!-- END Chat Messages -->

                            <!-- Chat Input -->
                            <form action="index.html" method="post" id="sidebar-chat-form" class="chat-form">
                                <input type="text" id="sidebar-chat-message" name="sidebar-chat-message" class="form-control form-control-borderless" placeholder="Type a message..">
                            </form>
                            <!-- END Chat Input -->
                        </div>
                        <!--  END Chat Talk -->
                        <!-- END Chat -->

                        <!-- Activity -->
                        <a href="javascript:void(0)" class="sidebar-title">
                            <i class="fa fa-globe pull-right"></i> <strong>Activity</strong>UI
                        </a>
                        <div class="sidebar-section">
                            <div class="alert alert-danger alert-alt">
                                <small>just now</small><br>
                                <i class="fa fa-thumbs-up fa-fw"></i> Upgraded to Pro plan
                            </div>
                            <div class="alert alert-info alert-alt">
                                <small>2 hours ago</small><br>
                                <i class="gi gi-coins fa-fw"></i> You had a new sale!
                            </div>
                            <div class="alert alert-success alert-alt">
                                <small>3 hours ago</small><br>
                                <i class="fa fa-plus fa-fw"></i> <a href="page_ready_user_profile.html"><strong>John Doe</strong></a> would like to become friends!<br>
                                <a href="javascript:void(0)" class="btn btn-xs btn-primary"><i class="fa fa-check"></i> Accept</a>
                                <a href="javascript:void(0)" class="btn btn-xs btn-default"><i class="fa fa-times"></i> Ignore</a>
                            </div>
                            <div class="alert alert-warning alert-alt">
                                <small>2 days ago</small><br>
                                Running low on space<br><strong>18GB in use</strong> 2GB left<br>
                                <a href="page_ready_pricing_tables.html" class="btn btn-xs btn-primary"><i class="fa fa-arrow-up"></i> Upgrade Plan</a>
                            </div>
                        </div>
                        <!-- END Activity -->

                        <!-- Messages -->
                        <a href="page_ready_inbox.html" class="sidebar-title">
                            <i class="fa fa-envelope pull-right"></i> <strong>Messages</strong>UI (5)
                        </a>
                        <div class="sidebar-section">
                            <div class="alert alert-alt">
                                Debra Stanley<small class="pull-right">just now</small><br>
                                <a href="page_ready_inbox_message.html"><strong>New Follower</strong></a>
                            </div>
                            <div class="alert alert-alt">
                                Sarah Cole<small class="pull-right">2 min ago</small><br>
                                <a href="page_ready_inbox_message.html"><strong>Your subscription was updated</strong></a>
                            </div>
                            <div class="alert alert-alt">
                                Bryan Porter<small class="pull-right">10 min ago</small><br>
                                <a href="page_ready_inbox_message.html"><strong>A great opportunity</strong></a>
                            </div>
                            <div class="alert alert-alt">
                                Jose Duncan<small class="pull-right">30 min ago</small><br>
                                <a href="page_ready_inbox_message.html"><strong>Account Activation</strong></a>
                            </div>
                            <div class="alert alert-alt">
                                Henry Ellis<small class="pull-right">40 min ago</small><br>
                                <a href="page_ready_inbox_message.html"><strong>You reached 10.000 Followers!</strong></a>
                            </div>
                        </div>
                        <!-- END Messages -->
                    </div>
                    <!-- END Sidebar Content -->
                </div>
                <!-- END Wrapper for scrolling functionality -->
            </div>
            <!-- END Alternative Sidebar -->

            <!-- Main Sidebar -->
            <div id="sidebar">
                <!-- Wrapper for scrolling functionality -->
                <div class="sidebar-scroll">
                    <!-- Sidebar Content -->
                    <div class="sidebar-content">
                        <!-- Brand -->
                        <a href="index.html" class="sidebar-brand">
                            <i class="gi gi-flash"></i><strong>Pro</strong>UI
                        </a>
                        <!-- END Brand -->

                        <!-- User Info -->
                        <div class="sidebar-section sidebar-user clearfix">
                            <div class="sidebar-user-avatar">
                                <a href="page_ready_user_profile.html">
                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar2.jpg" alt="avatar">
                                </a>
                            </div>
                            <div class="sidebar-user-name">John Doe</div>
                            <div class="sidebar-user-links">
                                <a href="page_ready_user_profile.html" data-toggle="tooltip" data-placement="bottom" title="Profile"><i class="gi gi-user"></i></a>
                                <a href="page_ready_inbox.html" data-toggle="tooltip" data-placement="bottom" title="Messages"><i class="gi gi-envelope"></i></a>
                                <!-- Opens the user settings modal that can be found at the bottom of each page (page_footer.html in PHP version) -->
                                <a href="#modal-user-settings" data-toggle="modal" class="enable-tooltip" data-placement="bottom" title="Settings"><i class="gi gi-cogwheel"></i></a>
                                <a href="login.html" data-toggle="tooltip" data-placement="bottom" title="Logout"><i class="gi gi-exit"></i></a>
                            </div>
                        </div>
                        <!-- END User Info -->

                        <!-- Theme Colors -->
                        <!-- Change Color Theme functionality can be found in js/app.js - templateOptions() -->
                        <ul class="sidebar-section sidebar-themes clearfix">
                            <li class="active">
                                <a href="javascript:void(0)" class="themed-background-dark-default themed-border-default" data-theme="default" data-toggle="tooltip" title="Default Blue"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-night themed-border-night" data-theme="css/themes/night.css" data-toggle="tooltip" title="Night"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-amethyst themed-border-amethyst" data-theme="css/themes/amethyst.css" data-toggle="tooltip" title="Amethyst"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-modern themed-border-modern" data-theme="css/themes/modern.css" data-toggle="tooltip" title="Modern"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-autumn themed-border-autumn" data-theme="css/themes/autumn.css" data-toggle="tooltip" title="Autumn"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-flatie themed-border-flatie" data-theme="css/themes/flatie.css" data-toggle="tooltip" title="Flatie"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-spring themed-border-spring" data-theme="css/themes/spring.css" data-toggle="tooltip" title="Spring"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-fancy themed-border-fancy" data-theme="css/themes/fancy.css" data-toggle="tooltip" title="Fancy"></a>
                            </li>
                            <li>
                                <a href="javascript:void(0)" class="themed-background-dark-fire themed-border-fire" data-theme="css/themes/fire.css" data-toggle="tooltip" title="Fire"></a>
                            </li>
                        </ul>
                        <!-- END Theme Colors -->

                        <!-- Sidebar Navigation -->
                        <ul class="sidebar-nav">
                            <li>
                                <a href="index.html"><i class="gi gi-stopwatch sidebar-nav-icon"></i>Dashboard</a>
                            </li>
                            <li class="sidebar-header">
                                <span class="sidebar-header-options clearfix"><a href="javascript:void(0)" data-toggle="tooltip" title="Quick Settings"><i class="gi gi-settings"></i></a><a href="javascript:void(0)" data-toggle="tooltip" title="Create the most amazing pages with the widget kit!"><i class="gi gi-lightbulb"></i></a></span>
                                <span class="sidebar-header-title">Widget Kit</span>
                            </li>
                            <li>
                                <a href="page_widgets_stats.html"><i class="gi gi-charts sidebar-nav-icon"></i>Statistics</a>
                            </li>
                            <li>
                                <a href="page_widgets_social.html"><i class="gi gi-share_alt sidebar-nav-icon"></i>Social</a>
                            </li>
                            <li>
                                <a href="page_widgets_media.html"><i class="gi gi-film sidebar-nav-icon"></i>Media</a>
                            </li>
                            <li>
                                <a href="page_widgets_links.html"><i class="gi gi-link sidebar-nav-icon"></i>Links</a>
                            </li>
                            <li class="sidebar-header">
                                <span class="sidebar-header-options clearfix"><a href="javascript:void(0)" data-toggle="tooltip" title="Quick Settings"><i class="gi gi-settings"></i></a></span>
                                <span class="sidebar-header-title">Design Kit</span>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-certificate sidebar-nav-icon"></i>User Interface</a>
                                <ul>
                                    <li>
                                        <a href="page_ui_grid_blocks.html">Grid &amp; Blocks</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_draggable_blocks.html">Draggable Blocks</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_typography.html">Typography</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_buttons_dropdowns.html">Buttons &amp; Dropdowns</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_navigation_more.html">Navigation &amp; More</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_horizontal_menu.html">Horizontal Menu</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_progress_loading.html">Progress &amp; Loading</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_preloader.html">Page Preloader</a>
                                    </li>
                                    <li>
                                        <a href="page_ui_color_themes.html">Color Themes</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-notes_2 sidebar-nav-icon"></i>Forms</a>
                                <ul>
                                    <li>
                                        <a href="page_forms_general.html">General</a>
                                    </li>
                                    <li>
                                        <a href="page_forms_components.html">Components</a>
                                    </li>
                                    <li>
                                        <a href="page_forms_validation.html">Validation</a>
                                    </li>
                                    <li>
                                        <a href="page_forms_wizard.html">Wizard</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-table sidebar-nav-icon"></i>Tables</a>
                                <ul>
                                    <li>
                                        <a href="page_tables_general.html">General</a>
                                    </li>
                                    <li>
                                        <a href="page_tables_responsive.html">Responsive</a>
                                    </li>
                                    <li>
                                        <a href="page_tables_datatables.html">Datatables</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-cup sidebar-nav-icon"></i>Icon Sets</a>
                                <ul>
                                    <li>
                                        <a href="page_icons_fontawesome.html">Font Awesome</a>
                                    </li>
                                    <li>
                                        <a href="page_icons_glyphicons_pro.html">Glyphicons Pro</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-show_big_thumbnails sidebar-nav-icon"></i>Page Layouts</a>
                                <ul>
                                    <li>
                                        <a href="page_layout_static.html">Static</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_fixed_footer.html">Static + Fixed Footer</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_fixed_top.html">Fixed Top Header</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_fixed_top_footer.html">Fixed Top Header + Footer</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_fixed_bottom.html">Fixed Bottom Header</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_fixed_bottom_footer.html">Fixed Bottom Header + Footer</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_main_sidebar_partial.html">Partial Main Sidebar</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_main_sidebar_visible.html">Visible Main Sidebar</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_alternative_sidebar_partial.html">Partial Alternative Sidebar</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_alternative_sidebar_visible.html">Visible Alternative Sidebar</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_no_sidebars.html">No Sidebars</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_both_partial.html">Both Sidebars Partial</a>
                                    </li>
                                    <li>
                                        <a href="page_layout_static_animated.html">Animated Sidebar Transitions</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="sidebar-header">
                                <span class="sidebar-header-options clearfix"><a href="javascript:void(0)" data-toggle="tooltip" title="Quick Settings"><i class="gi gi-settings"></i></a></span>
                                <span class="sidebar-header-title">Develop Kit</span>
                            </li>
                            <li>
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="fa fa-wrench sidebar-nav-icon"></i>Components</a>
                                <ul>
                                    <li>
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>3 Level Menu</a>
                                        <ul>
                                            <li>
                                                <a href="#">Link 1</a>
                                            </li>
                                            <li>
                                                <a href="#">Link 2</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="page_comp_maps.html">Maps</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_charts.html">Charts</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_gallery.html">Gallery</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_carousel.html">Carousel</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_calendar.html">Calendar</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_animations.html">CSS3 Animations</a>
                                    </li>
                                    <li>
                                        <a href="page_comp_syntax_highlighting.html">Syntax Highlighting</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="active">
                                <a href="#" class="sidebar-nav-menu"><i class="fa fa-angle-left sidebar-nav-indicator"></i><i class="gi gi-brush sidebar-nav-icon"></i>Ready Pages</a>
                                <ul>
                                    <li>
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>Errors</a>
                                        <ul>
                                            <li>
                                                <a href="page_ready_400.html">400</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_401.html">401</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_403.html">403</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_404.html">404</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_500.html">500</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_503.html">503</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>Get Started</a>
                                        <ul>
                                            <li>
                                                <a href="page_ready_blank.html">Blank</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_blank_alt.html">Blank Alternative</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="page_ready_search_results.html">Search Results (4)</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_article.html">Article</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_user_profile.html">User Profile</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_contacts.html">Contacts</a>
                                    </li>
                                    <li class="active">
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>e-Learning</a>
                                        <ul>
                                            <li>
                                                <a href="page_ready_elearning_courses.html" class="active">Courses</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_elearning_course_lessons.html">Course - Lessons</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_elearning_course_lesson.html">Course - Lesson Page</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>Message Center</a>
                                        <ul>
                                            <li>
                                                <a href="page_ready_inbox.html">Inbox</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_inbox_compose.html">Compose Message</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_inbox_message.html">View Message</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="page_ready_chat.html">Chat</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_timeline.html">Timeline</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_tickets.html">Tickets</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_tasks.html">Tasks</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_faq.html">FAQ</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_pricing_tables.html">Pricing Tables</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_invoice.html">Invoice</a>
                                    </li>
                                    <li>
                                        <a href="page_ready_forum.html">Forum (3)</a>
                                    </li>
                                    <li>
                                        <a href="#" class="sidebar-nav-submenu"><i class="fa fa-angle-left sidebar-nav-indicator"></i>Login, Register &amp; Lock</a>
                                        <ul>
                                            <li>
                                                <a href="login.html">Login</a>
                                            </li>
                                            <li>
                                                <a href="login_full.html">Login (Full Background)</a>
                                            </li>
                                            <li>
                                                <a href="login_alt.html">Login 2</a>
                                            </li>
                                            <li>
                                                <a href="login.html#reminder">Password Reminder</a>
                                            </li>
                                            <li>
                                                <a href="login_alt.html#reminder">Password Reminder 2</a>
                                            </li>
                                            <li>
                                                <a href="login.html#register">Register</a>
                                            </li>
                                            <li>
                                                <a href="login_alt.html#register">Register 2</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_lock_screen.html">Lock Screen</a>
                                            </li>
                                            <li>
                                                <a href="page_ready_lock_screen_alt.html">Lock Screen 2</a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <!-- END Sidebar Navigation -->

                        <!-- Sidebar Notifications -->
                        <div class="sidebar-header">
                            <span class="sidebar-header-options clearfix">
                                <a href="javascript:void(0)" data-toggle="tooltip" title="Refresh"><i class="gi gi-refresh"></i></a>
                            </span>
                            <span class="sidebar-header-title">Activity</span>
                        </div>
                        <div class="sidebar-section">
                            <div class="alert alert-success alert-alt">
                                <small>5 min ago</small><br>
                                <i class="fa fa-thumbs-up fa-fw"></i> You had a new sale ($10)
                            </div>
                            <div class="alert alert-info alert-alt">
                                <small>10 min ago</small><br>
                                <i class="fa fa-arrow-up fa-fw"></i> Upgraded to Pro plan
                            </div>
                            <div class="alert alert-warning alert-alt">
                                <small>3 hours ago</small><br>
                                <i class="fa fa-exclamation fa-fw"></i> Running low on space<br><strong>18GB in use</strong> 2GB left
                            </div>
                            <div class="alert alert-danger alert-alt">
                                <small>Yesterday</small><br>
                                <i class="fa fa-bug fa-fw"></i> <a href="javascript:void(0)"><strong>New bug submitted</strong></a>
                            </div>
                        </div>
                        <!-- END Sidebar Notifications -->
                    </div>
                    <!-- END Sidebar Content -->
                </div>
                <!-- END Wrapper for scrolling functionality -->
            </div>
            <!-- END Main Sidebar -->

            <!-- Main Container -->
            <div id="main-container">
                <!-- Header -->
                <!-- In the PHP version you can set the following options from inc/config file -->
                <!--
                    Available header.navbar classes:

                    'navbar-default'            for the default light header
                    'navbar-inverse'            for an alternative dark header

                    'navbar-fixed-top'          for a top fixed header (fixed sidebars with scroll will be auto initialized, functionality can be found in js/app.js - handleSidebar())
                        'header-fixed-top'      has to be added on #page-container only if the class 'navbar-fixed-top' was added

                    'navbar-fixed-bottom'       for a bottom fixed header (fixed sidebars with scroll will be auto initialized, functionality can be found in js/app.js - handleSidebar()))
                        'header-fixed-bottom'   has to be added on #page-container only if the class 'navbar-fixed-bottom' was added
                -->
                <header class="navbar navbar-default">
                    <!-- Left Header Navigation -->
                    <ul class="nav navbar-nav-custom">
                        <!-- Main Sidebar Toggle Button -->
                        <li>
                            <a href="javascript:void(0)" onclick="App.sidebar('toggle-sidebar');">
                                <i class="fa fa-bars fa-fw"></i>
                            </a>
                        </li>
                        <!-- END Main Sidebar Toggle Button -->

                        <!-- Template Options -->
                        <!-- Change Options functionality can be found in js/app.js - templateOptions() -->
                        <li class="dropdown">
                            <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="gi gi-settings"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-custom dropdown-options">
                                <li class="dropdown-header text-center">Header Style</li>
                                <li>
                                    <div class="btn-group btn-group-justified btn-group-sm">
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-header-default">Light</a>
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-header-inverse">Dark</a>
                                    </div>
                                </li>
                                <li class="dropdown-header text-center">Page Style</li>
                                <li>
                                    <div class="btn-group btn-group-justified btn-group-sm">
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-main-style">Default</a>
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-main-style-alt">Alternative</a>
                                    </div>
                                </li>
                                <li class="dropdown-header text-center">Main Layout</li>
                                <li>
                                    <button class="btn btn-sm btn-block btn-primary" id="options-header-top">Fixed Side/Header (Top)</button>
                                    <button class="btn btn-sm btn-block btn-primary" id="options-header-bottom">Fixed Side/Header (Bottom)</button>
                                </li>
                                <li class="dropdown-header text-center">Footer</li>
                                <li>
                                    <div class="btn-group btn-group-justified btn-group-sm">
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-footer-static">Default</a>
                                        <a href="javascript:void(0)" class="btn btn-primary" id="options-footer-fixed">Fixed</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <!-- END Template Options -->
                    </ul>
                    <!-- END Left Header Navigation -->

                    <!-- Search Form -->
                    <form action="page_ready_search_results.html" method="post" class="navbar-form-custom" role="search">
                        <div class="form-group">
                            <input type="text" id="top-search" name="top-search" class="form-control" placeholder="Search..">
                        </div>
                    </form>
                    <!-- END Search Form -->

                    <!-- Right Header Navigation -->
                    <ul class="nav navbar-nav-custom pull-right">
                        <!-- Alternative Sidebar Toggle Button -->
                        <li>
                            <!-- If you do not want the main sidebar to open when the alternative sidebar is closed, just remove the second parameter: App.sidebar('toggle-sidebar-alt'); -->
                            <a href="javascript:void(0)" onclick="App.sidebar('toggle-sidebar-alt', 'toggle-other');">
                                <i class="gi gi-share_alt"></i>
                                <span class="label label-primary label-indicator animation-floating">4</span>
                            </a>
                        </li>
                        <!-- END Alternative Sidebar Toggle Button -->

                        <!-- User Dropdown -->
                        <li class="dropdown">
                            <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">
                                <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar2.jpg" alt="avatar"> <i class="fa fa-angle-down"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-custom dropdown-menu-right">
                                <li class="dropdown-header text-center">Account</li>
                                <li>
                                    <a href="page_ready_timeline.html">
                                        <i class="fa fa-clock-o fa-fw pull-right"></i>
                                        <span class="badge pull-right">10</span>
                                        Updates
                                    </a>
                                    <a href="page_ready_inbox.html">
                                        <i class="fa fa-envelope-o fa-fw pull-right"></i>
                                        <span class="badge pull-right">5</span>
                                        Messages
                                    </a>
                                    <a href="page_ready_pricing_tables.html"><i class="fa fa-magnet fa-fw pull-right"></i>
                                        <span class="badge pull-right">3</span>
                                        Subscriptions
                                    </a>
                                    <a href="page_ready_faq.html"><i class="fa fa-question fa-fw pull-right"></i>
                                        <span class="badge pull-right">11</span>
                                        FAQ
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="page_ready_user_profile.html">
                                        <i class="fa fa-user fa-fw pull-right"></i>
                                        Profile
                                    </a>
                                    <!-- Opens the user settings modal that can be found at the bottom of each page (page_footer.html in PHP version) -->
                                    <a href="#modal-user-settings" data-toggle="modal">
                                        <i class="fa fa-cog fa-fw pull-right"></i>
                                        Settings
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="page_ready_lock_screen.html"><i class="fa fa-lock fa-fw pull-right"></i> Lock Account</a>
                                    <a href="login.html"><i class="fa fa-ban fa-fw pull-right"></i> Logout</a>
                                </li>
                                <li class="dropdown-header text-center">Activity</li>
                                <li>
                                    <div class="alert alert-success alert-alt">
                                        <small>5 min ago</small><br>
                                        <i class="fa fa-thumbs-up fa-fw"></i> You had a new sale ($10)
                                    </div>
                                    <div class="alert alert-info alert-alt">
                                        <small>10 min ago</small><br>
                                        <i class="fa fa-arrow-up fa-fw"></i> Upgraded to Pro plan
                                    </div>
                                    <div class="alert alert-warning alert-alt">
                                        <small>3 hours ago</small><br>
                                        <i class="fa fa-exclamation fa-fw"></i> Running low on space<br><strong>18GB in use</strong> 2GB left
                                    </div>
                                    <div class="alert alert-danger alert-alt">
                                        <small>Yesterday</small><br>
                                        <i class="fa fa-bug fa-fw"></i> <a href="javascript:void(0)" class="alert-link">New bug submitted</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <!-- END User Dropdown -->
                    </ul>
                    <!-- END Right Header Navigation -->
                </header>
                <!-- END Header -->

                <!-- Page content -->
                <div id="page-content">
                    <!-- Courses Header -->
                    <div class="content-header">
                        <div class="header-section">
                            <h1>
                                <i class="gi gi-book_open"></i>Welcome to <strong>e-Learning</strong><br><small>Courses Hub!</small>
                            </h1>
                        </div>
                    </div>
                    <ul class="breadcrumb breadcrumb-top">
                        <li>Pages</li>
                        <li>e-Learning</li>
                        <li><a href="">Courses</a></li>
                    </ul>
                    <!-- END Courses Header -->

                    <!-- Main Row -->
                    <div class="row">
                        <div class="col-md-8">
                            <!-- Courses Content -->
                            <div class="row">
                               







<c:forEach items="${modules}" var="m">



                                <!-- Course Widget -->
                                <div class="col-sm-6">
                                    <div class="widget">
                                        <div class="widget-advanced">
                                            <!-- Widget Header -->
                                            <div class="widget-header text-center themed-background-dark-flatie">
                                                <div class="widget-options">
                                                    <button class="btn btn-xs btn-default" data-toggle="tooltip" title="Love it!"><i class="fa fa-heart text-danger"></i></button>
                                                </div>
                                                <h3 class="widget-content-light">
                                                    <a href="page_ready_elearning_course_lessons.html" class="themed-color-flatie">${m.nomModule}</a><br>
                                                    <small>${m.getDescriptionModule()}</small>
                                                </h3>
                                            </div>
                                            <!-- END Widget Header -->

                                            <!-- Widget Main -->
                                            <div class="widget-main">
                                                <a href="page_ready_elearning_course_lessons.html" class="widget-image-container animation-fadeIn">
                                                    <span class="widget-icon themed-background-flatie"><i class="fa fa-code"></i></span>
                                                </a>
                                                <a href="page_ready_elearning_course_lessons.html" class="btn btn-sm btn-default pull-right">
                                                  
                                                    <i class="fa fa-clock-o"></i> ${m.getNombreHeures()} hours
                                                </a>
                                                <a href="page_ready_elearning_course_lessons.html" class="btn btn-sm btn-info">Free</a>
                                            </div>
                                            <!-- END Widget Main -->
                                        </div>
                                    </div>
                                </div>
                                <!-- END Course Widget -->


</c:forEach>


















                                
                                
                                
                                
                                
                                
                            </div>
                            <!-- END Courses Content -->
                        </div>
                        <div class="col-md-4">
                            <!-- Navigation Tabs -->
                            <div class="block full">
                                <!-- Navigation Tabs Title -->
                                <div class="block-title">
                                    <ul class="nav nav-tabs" data-toggle="tabs">
                                        <li class="active"><a href="#courses-categories">Categories</a></li>
                                        <li><a href="#courses-tools">Tools</a></li>
                                    </ul>
                                </div>
                                <!-- END Navigation Tabs Title -->

                                <!-- Navigation Tabs Content -->
                                <div class="tab-content">
                                    <div class="tab-pane active" id="courses-categories">
                                        <ul class="nav nav-pills nav-stacked">
                                            <li class="active">
                                                <a href="javascript:void(0)"><span class="badge pull-right">271</span>All Topics</a>
                                            </li>
                                            <li>
                                                <hr>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">75</span><i class="gi gi-brush fa-fw themed-color-dark"></i> Design &amp; Illustration</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">60</span><i class="fa fa-code-fork fa-fw themed-color-dark"></i> Code</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">56</span><i class="gi gi-globe fa-fw themed-color-dark"></i> Web Design</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">30</span><i class="gi gi-camera fa-fw themed-color-dark"></i> Photography</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">38</span><i class="gi gi-camera_small fa-fw themed-color-dark"></i> 3D &amp; Motion Graphics</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">12</span><i class="gi gi-package fa-fw themed-color-dark"></i> Bundles</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="tab-pane" id="courses-tools">
                                        <ul class="nav nav-pills nav-stacked">
                                            <li class="active">
                                                <a href="javascript:void(0)"><span class="badge pull-right">271</span>All Tools</a>
                                            </li>
                                            <li>
                                                <hr>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">25</span>Photoshop</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">10</span>Illustrator</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">5</span>InDesign</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">4</span>Cinema 4D</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)"><span class="badge pull-right">16</span>Lightroom</a>
                                            </li>
                                        </ul>
                                        <div class="text-center">
                                            <a href="javascript:void(0)" class="btn btn-xs btn-default">Show More..</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- END Navigation Tabs Content -->
                            </div>
                            <!-- END Navigation Tabs -->

                            <!-- Your Account Block -->
                            <div class="block">
                                <!-- Your Account Title -->
                                <div class="block-title">
                                    <div class="block-options pull-right">
                                        <a href="javascript:void(0)" class="btn btn-alt btn-sm btn-default" data-toggle="tooltip" title="Settings">
                                            <i class="fa fa-cog"></i>
                                        </a>
                                    </div>
                                    <h2><strong>Account</strong> Status</h2>
                                </div>
                                <!-- END Your Account Title -->

                                <!-- Your Account Content -->
                                <div class="block-section">
                                    <table class="table table-borderless table-striped table-vcenter">
                                        <tbody>
                                            <tr>
                                                <td class="text-right" style="width: 30%;">
                                                    <img src="<%=request.getContextPath()%>/resources/img/placeholders/avatars/avatar2.jpg" alt="avatar" class="img-circle">
                                                </td>
                                                <td><a href="page_ready_user_profile.html"><strong>John Doe</strong></a><br><em>e-Learner</em></td>
                                            </tr>
                                            <tr>
                                                <td class="text-right">Account</td>
                                                <td>
                                                    <strong>Basic</strong> <a href="page_ready_pricing_tables.html">Upgrade?</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="text-right">Courses</td>
                                                <td>
                                                    <i class="fa fa-plus fa-fw text-info"></i> <a href="javascript:void(0)"><strong>3</strong> New</a><br>
                                                    <i class="fa fa-heart fa-fw text-danger"></i> <a href="javascript:void(0)"><strong>5</strong> Favorites</a><br>
                                                    <i class="fa fa-check fa-fw text-success"></i> <a href="javascript:void(0)"><strong>10</strong> Completed</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- END Your Account Content -->
                            </div>
                            <!-- END Your Account Block -->

                            <!-- Most Viewed Courses Block -->
                            <div class="block">
                                <!-- Most Viewed Courses Title -->
                                <div class="block-title">
                                    <h2><strong>Most Viewed</strong> Courses</h2>
                                </div>
                                <!-- END Most Viewed Courses Title -->

                                <!-- Most Viewed Courses Content -->
                                <table class="table table-striped table-vcenter">
                                    <tbody>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Intro to HTML5</a><br>
                                                <small>Web Design</small>
                                            </td>
                                            <td class="text-center" style="width: 70px;">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Vector Graphics</a><br>
                                                <small>Design &amp; Illustration</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Using Cinema 4D</a><br>
                                                <small>3D & Motion Graphics</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Intro to Illustrator</a><br>
                                                <small>Design &amp; Illustration</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Photoshop for Photographers</a><br>
                                                <small>Photography</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Learn Javascript in a Month</a><br>
                                                <small>Code</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Intro to Lightroom</a><br>
                                                <small>Photography</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Learn CSS3 in a Week</a><br>
                                                <small>Web Design</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="page_ready_elearning_course_lessons.html">Jquery: The Essentials</a><br>
                                                <small>Code</small>
                                            </td>
                                            <td class="text-center">
                                                <div class="btn-group btn-group-xs">
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-shopping-cart"></i></a>
                                                    <a href="javascript:void(0)" class="btn btn-default"><i class="fa fa-heart text-danger"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <!-- END Most Viewed Courses Content -->
                            </div>
                            <!-- END Most Viewed Courses Block -->
                        </div>
                    </div>
                    <!-- END Main Row -->
                </div>
                <!-- END Page Content -->

                <!-- Footer -->
                <footer class="clearfix">
                    <div class="pull-right">
                        Crafted with <i class="fa fa-heart text-danger"></i> by <a href="http://goo.gl/vNS3I" target="_blank">pixelcave</a>
                    </div>
                    <div class="pull-left">
                        <span id="year-copy"></span> &copy; <a href="http://goo.gl/TDOSuC" target="_blank">ProUI 2.1</a>
                    </div>
                </footer>
                <!-- END Footer -->
            </div>
            <!-- END Main Container -->
        </div>
        <!-- END Page Container -->

        <!-- Scroll to top link, initialized in js/app.js - scrollToTop() -->
        <a href="#" id="to-top"><i class="fa fa-angle-double-up"></i></a>

        <!-- User Settings, modal which opens from Settings link (found in top right user menu) and the Cog link (found in sidebar user info) -->
        <div id="modal-user-settings" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <!-- Modal Header -->
                    <div class="modal-header text-center">
                        <h2 class="modal-title"><i class="fa fa-pencil"></i> Settings</h2>
                    </div>
                    <!-- END Modal Header -->

                    <!-- Modal Body -->
                    <div class="modal-body">
                        <form action="index.html" method="post" enctype="multipart/form-data" class="form-horizontal form-bordered" onsubmit="return false;">
                            <fieldset>
                                <legend>Vital Info</legend>
                                <div class="form-group">
                                    <label class="col-md-4 control-label">Username</label>
                                    <div class="col-md-8">
                                        <p class="form-control-static">Admin</p>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="user-settings-email">Email</label>
                                    <div class="col-md-8">
                                        <input type="email" id="user-settings-email" name="user-settings-email" class="form-control" value="admin@example.com">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="user-settings-notifications">Email Notifications</label>
                                    <div class="col-md-8">
                                        <label class="switch switch-primary">
                                            <input type="checkbox" id="user-settings-notifications" name="user-settings-notifications" value="1" checked>
                                            <span></span>
                                        </label>
                                    </div>
                                </div>
                            </fieldset>
                            <fieldset>
                                <legend>Password Update</legend>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="user-settings-password">New Password</label>
                                    <div class="col-md-8">
                                        <input type="password" id="user-settings-password" name="user-settings-password" class="form-control" placeholder="Please choose a complex one..">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="user-settings-repassword">Confirm New Password</label>
                                    <div class="col-md-8">
                                        <input type="password" id="user-settings-repassword" name="user-settings-repassword" class="form-control" placeholder="..and confirm it!">
                                    </div>
                                </div>
                            </fieldset>
                            <div class="form-group form-actions">
                                <div class="col-xs-12 text-right">
                                    <button type="button" class="btn btn-sm btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-sm btn-primary">Save Changes</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- END Modal Body -->
                </div>
            </div>
        </div>
        <!-- END User Settings -->

        <!-- Include Jquery library from Google's CDN but if something goes wrong get Jquery from local file (Remove 'http:' if you have SSL) -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>!window.jQuery && document.write(decodeURI('%3Cscript src="js/vendor/jquery-1.11.1.min.js"%3E%3C/script%3E'));</script>

        <!-- Bootstrap.js, Jquery plugins and Custom JS code -->
        <script src="<%=request.getContextPath()%>/resources/js/vendor/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/plugins.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/app.js"></script>
    </body>
</html>